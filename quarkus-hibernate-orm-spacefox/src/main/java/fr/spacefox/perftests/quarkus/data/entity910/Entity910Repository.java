package fr.spacefox.perftests.quarkus.data.entity910;

import fr.spacefox.perftests.quarkus.core.port.data.Entity910DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service910.model.Model910;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity910Repository implements Entity910DatasourcePort, PanacheRepository<Entity910> {
    @Override
    public Optional<Model910> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
