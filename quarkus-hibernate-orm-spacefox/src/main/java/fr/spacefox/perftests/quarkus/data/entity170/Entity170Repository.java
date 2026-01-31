package fr.spacefox.perftests.quarkus.data.entity170;

import fr.spacefox.perftests.quarkus.core.port.data.Entity170DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service170.model.Model170;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity170Repository implements Entity170DatasourcePort, PanacheRepository<Entity170> {
    @Override
    public Optional<Model170> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
