package fr.spacefox.perftests.quarkus.data.entity45;

import fr.spacefox.perftests.quarkus.core.port.data.Entity45DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service45.model.Model45;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity45Repository implements Entity45DatasourcePort, PanacheRepository<Entity45> {
    @Override
    public Optional<Model45> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
