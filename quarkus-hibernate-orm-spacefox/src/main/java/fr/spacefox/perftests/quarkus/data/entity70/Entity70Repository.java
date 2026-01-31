package fr.spacefox.perftests.quarkus.data.entity70;

import fr.spacefox.perftests.quarkus.core.port.data.Entity70DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service70.model.Model70;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity70Repository implements Entity70DatasourcePort, PanacheRepository<Entity70> {
    @Override
    public Optional<Model70> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
