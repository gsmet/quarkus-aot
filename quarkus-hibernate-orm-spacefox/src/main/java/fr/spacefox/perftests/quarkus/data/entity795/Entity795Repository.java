package fr.spacefox.perftests.quarkus.data.entity795;

import fr.spacefox.perftests.quarkus.core.port.data.Entity795DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service795.model.Model795;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity795Repository implements Entity795DatasourcePort, PanacheRepository<Entity795> {
    @Override
    public Optional<Model795> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
