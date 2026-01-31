package fr.spacefox.perftests.quarkus.data.entity943;

import fr.spacefox.perftests.quarkus.core.port.data.Entity943DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service943.model.Model943;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity943Repository implements Entity943DatasourcePort, PanacheRepository<Entity943> {
    @Override
    public Optional<Model943> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
