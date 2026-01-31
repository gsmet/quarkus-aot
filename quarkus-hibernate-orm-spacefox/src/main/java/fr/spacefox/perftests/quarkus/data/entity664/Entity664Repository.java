package fr.spacefox.perftests.quarkus.data.entity664;

import fr.spacefox.perftests.quarkus.core.port.data.Entity664DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service664.model.Model664;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity664Repository implements Entity664DatasourcePort, PanacheRepository<Entity664> {
    @Override
    public Optional<Model664> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
