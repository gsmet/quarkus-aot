package fr.spacefox.perftests.quarkus.data.entity372;

import fr.spacefox.perftests.quarkus.core.port.data.Entity372DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service372.model.Model372;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity372Repository implements Entity372DatasourcePort, PanacheRepository<Entity372> {
    @Override
    public Optional<Model372> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
