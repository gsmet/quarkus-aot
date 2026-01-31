package fr.spacefox.perftests.quarkus.data.entity676;

import fr.spacefox.perftests.quarkus.core.port.data.Entity676DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service676.model.Model676;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity676Repository implements Entity676DatasourcePort, PanacheRepository<Entity676> {
    @Override
    public Optional<Model676> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
