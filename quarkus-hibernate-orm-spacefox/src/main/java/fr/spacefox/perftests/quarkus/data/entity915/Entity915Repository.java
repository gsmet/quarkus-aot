package fr.spacefox.perftests.quarkus.data.entity915;

import fr.spacefox.perftests.quarkus.core.port.data.Entity915DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service915.model.Model915;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity915Repository implements Entity915DatasourcePort, PanacheRepository<Entity915> {
    @Override
    public Optional<Model915> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
