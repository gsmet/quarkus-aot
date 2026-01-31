package fr.spacefox.perftests.quarkus.data.entity463;

import fr.spacefox.perftests.quarkus.core.port.data.Entity463DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service463.model.Model463;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity463Repository implements Entity463DatasourcePort, PanacheRepository<Entity463> {
    @Override
    public Optional<Model463> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
