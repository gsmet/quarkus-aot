package fr.spacefox.perftests.quarkus.data.entity573;

import fr.spacefox.perftests.quarkus.core.port.data.Entity573DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service573.model.Model573;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity573Repository implements Entity573DatasourcePort, PanacheRepository<Entity573> {
    @Override
    public Optional<Model573> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
