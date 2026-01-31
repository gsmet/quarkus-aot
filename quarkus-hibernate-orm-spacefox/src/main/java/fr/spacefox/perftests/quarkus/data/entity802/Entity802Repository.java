package fr.spacefox.perftests.quarkus.data.entity802;

import fr.spacefox.perftests.quarkus.core.port.data.Entity802DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service802.model.Model802;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity802Repository implements Entity802DatasourcePort, PanacheRepository<Entity802> {
    @Override
    public Optional<Model802> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
