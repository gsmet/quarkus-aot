package fr.spacefox.perftests.quarkus.data.entity15;

import fr.spacefox.perftests.quarkus.core.port.data.Entity15DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service15.model.Model15;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity15Repository implements Entity15DatasourcePort, PanacheRepository<Entity15> {
    @Override
    public Optional<Model15> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
