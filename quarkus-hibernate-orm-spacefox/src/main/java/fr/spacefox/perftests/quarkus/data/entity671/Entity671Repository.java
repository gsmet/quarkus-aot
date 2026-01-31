package fr.spacefox.perftests.quarkus.data.entity671;

import fr.spacefox.perftests.quarkus.core.port.data.Entity671DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service671.model.Model671;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity671Repository implements Entity671DatasourcePort, PanacheRepository<Entity671> {
    @Override
    public Optional<Model671> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
