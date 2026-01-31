package fr.spacefox.perftests.quarkus.data.entity818;

import fr.spacefox.perftests.quarkus.core.port.data.Entity818DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service818.model.Model818;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity818Repository implements Entity818DatasourcePort, PanacheRepository<Entity818> {
    @Override
    public Optional<Model818> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
