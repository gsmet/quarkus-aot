package fr.spacefox.perftests.quarkus.data.entity749;

import fr.spacefox.perftests.quarkus.core.port.data.Entity749DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service749.model.Model749;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity749Repository implements Entity749DatasourcePort, PanacheRepository<Entity749> {
    @Override
    public Optional<Model749> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
