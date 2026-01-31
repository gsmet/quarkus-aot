package fr.spacefox.perftests.quarkus.data.entity275;

import fr.spacefox.perftests.quarkus.core.port.data.Entity275DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service275.model.Model275;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity275Repository implements Entity275DatasourcePort, PanacheRepository<Entity275> {
    @Override
    public Optional<Model275> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
