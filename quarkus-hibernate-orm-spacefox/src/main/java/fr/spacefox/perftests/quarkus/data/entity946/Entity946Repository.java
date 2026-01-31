package fr.spacefox.perftests.quarkus.data.entity946;

import fr.spacefox.perftests.quarkus.core.port.data.Entity946DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service946.model.Model946;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity946Repository implements Entity946DatasourcePort, PanacheRepository<Entity946> {
    @Override
    public Optional<Model946> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
