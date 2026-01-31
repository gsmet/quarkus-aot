package fr.spacefox.perftests.quarkus.data.entity560;

import fr.spacefox.perftests.quarkus.core.port.data.Entity560DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service560.model.Model560;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity560Repository implements Entity560DatasourcePort, PanacheRepository<Entity560> {
    @Override
    public Optional<Model560> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
