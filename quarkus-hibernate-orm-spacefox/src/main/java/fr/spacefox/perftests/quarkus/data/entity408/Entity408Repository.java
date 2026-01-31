package fr.spacefox.perftests.quarkus.data.entity408;

import fr.spacefox.perftests.quarkus.core.port.data.Entity408DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service408.model.Model408;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity408Repository implements Entity408DatasourcePort, PanacheRepository<Entity408> {
    @Override
    public Optional<Model408> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
