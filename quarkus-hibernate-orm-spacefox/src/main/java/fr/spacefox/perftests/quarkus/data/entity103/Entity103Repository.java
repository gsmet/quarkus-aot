package fr.spacefox.perftests.quarkus.data.entity103;

import fr.spacefox.perftests.quarkus.core.port.data.Entity103DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service103.model.Model103;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity103Repository implements Entity103DatasourcePort, PanacheRepository<Entity103> {
    @Override
    public Optional<Model103> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
