package fr.spacefox.perftests.quarkus.data.entity761;

import fr.spacefox.perftests.quarkus.core.port.data.Entity761DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service761.model.Model761;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity761Repository implements Entity761DatasourcePort, PanacheRepository<Entity761> {
    @Override
    public Optional<Model761> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
