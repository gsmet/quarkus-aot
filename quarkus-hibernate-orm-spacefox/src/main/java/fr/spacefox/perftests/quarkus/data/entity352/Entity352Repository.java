package fr.spacefox.perftests.quarkus.data.entity352;

import fr.spacefox.perftests.quarkus.core.port.data.Entity352DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service352.model.Model352;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity352Repository implements Entity352DatasourcePort, PanacheRepository<Entity352> {
    @Override
    public Optional<Model352> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
