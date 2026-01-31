package fr.spacefox.perftests.quarkus.data.entity109;

import fr.spacefox.perftests.quarkus.core.port.data.Entity109DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service109.model.Model109;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity109Repository implements Entity109DatasourcePort, PanacheRepository<Entity109> {
    @Override
    public Optional<Model109> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
