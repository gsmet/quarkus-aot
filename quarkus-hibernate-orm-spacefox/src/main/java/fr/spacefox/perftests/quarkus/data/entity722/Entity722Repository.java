package fr.spacefox.perftests.quarkus.data.entity722;

import fr.spacefox.perftests.quarkus.core.port.data.Entity722DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service722.model.Model722;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity722Repository implements Entity722DatasourcePort, PanacheRepository<Entity722> {
    @Override
    public Optional<Model722> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
