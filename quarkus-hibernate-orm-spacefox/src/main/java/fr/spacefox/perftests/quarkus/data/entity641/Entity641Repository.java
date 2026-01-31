package fr.spacefox.perftests.quarkus.data.entity641;

import fr.spacefox.perftests.quarkus.core.port.data.Entity641DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service641.model.Model641;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity641Repository implements Entity641DatasourcePort, PanacheRepository<Entity641> {
    @Override
    public Optional<Model641> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
