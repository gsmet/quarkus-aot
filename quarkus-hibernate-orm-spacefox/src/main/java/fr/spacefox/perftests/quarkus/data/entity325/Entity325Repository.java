package fr.spacefox.perftests.quarkus.data.entity325;

import fr.spacefox.perftests.quarkus.core.port.data.Entity325DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service325.model.Model325;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity325Repository implements Entity325DatasourcePort, PanacheRepository<Entity325> {
    @Override
    public Optional<Model325> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
