package fr.spacefox.perftests.quarkus.data.entity607;

import fr.spacefox.perftests.quarkus.core.port.data.Entity607DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service607.model.Model607;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity607Repository implements Entity607DatasourcePort, PanacheRepository<Entity607> {
    @Override
    public Optional<Model607> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
