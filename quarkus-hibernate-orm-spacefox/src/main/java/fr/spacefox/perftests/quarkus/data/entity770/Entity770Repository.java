package fr.spacefox.perftests.quarkus.data.entity770;

import fr.spacefox.perftests.quarkus.core.port.data.Entity770DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service770.model.Model770;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity770Repository implements Entity770DatasourcePort, PanacheRepository<Entity770> {
    @Override
    public Optional<Model770> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
