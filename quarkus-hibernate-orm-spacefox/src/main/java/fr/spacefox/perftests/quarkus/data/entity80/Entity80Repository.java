package fr.spacefox.perftests.quarkus.data.entity80;

import fr.spacefox.perftests.quarkus.core.port.data.Entity80DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service80.model.Model80;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity80Repository implements Entity80DatasourcePort, PanacheRepository<Entity80> {
    @Override
    public Optional<Model80> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
