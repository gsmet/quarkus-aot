package fr.spacefox.perftests.quarkus.data.entity175;

import fr.spacefox.perftests.quarkus.core.port.data.Entity175DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service175.model.Model175;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity175Repository implements Entity175DatasourcePort, PanacheRepository<Entity175> {
    @Override
    public Optional<Model175> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
