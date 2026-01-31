package fr.spacefox.perftests.quarkus.data.entity695;

import fr.spacefox.perftests.quarkus.core.port.data.Entity695DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service695.model.Model695;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity695Repository implements Entity695DatasourcePort, PanacheRepository<Entity695> {
    @Override
    public Optional<Model695> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
