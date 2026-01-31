package fr.spacefox.perftests.quarkus.data.entity432;

import fr.spacefox.perftests.quarkus.core.port.data.Entity432DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service432.model.Model432;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity432Repository implements Entity432DatasourcePort, PanacheRepository<Entity432> {
    @Override
    public Optional<Model432> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
