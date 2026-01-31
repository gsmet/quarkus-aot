package fr.spacefox.perftests.quarkus.data.entity298;

import fr.spacefox.perftests.quarkus.core.port.data.Entity298DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service298.model.Model298;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity298Repository implements Entity298DatasourcePort, PanacheRepository<Entity298> {
    @Override
    public Optional<Model298> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
