package fr.spacefox.perftests.quarkus.data.entity627;

import fr.spacefox.perftests.quarkus.core.port.data.Entity627DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service627.model.Model627;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity627Repository implements Entity627DatasourcePort, PanacheRepository<Entity627> {
    @Override
    public Optional<Model627> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
