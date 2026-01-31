package fr.spacefox.perftests.quarkus.data.entity567;

import fr.spacefox.perftests.quarkus.core.port.data.Entity567DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service567.model.Model567;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity567Repository implements Entity567DatasourcePort, PanacheRepository<Entity567> {
    @Override
    public Optional<Model567> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
