package fr.spacefox.perftests.quarkus.data.entity990;

import fr.spacefox.perftests.quarkus.core.port.data.Entity990DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service990.model.Model990;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity990Repository implements Entity990DatasourcePort, PanacheRepository<Entity990> {
    @Override
    public Optional<Model990> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
