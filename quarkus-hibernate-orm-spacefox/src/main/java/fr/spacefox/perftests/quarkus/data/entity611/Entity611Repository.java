package fr.spacefox.perftests.quarkus.data.entity611;

import fr.spacefox.perftests.quarkus.core.port.data.Entity611DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service611.model.Model611;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity611Repository implements Entity611DatasourcePort, PanacheRepository<Entity611> {
    @Override
    public Optional<Model611> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
