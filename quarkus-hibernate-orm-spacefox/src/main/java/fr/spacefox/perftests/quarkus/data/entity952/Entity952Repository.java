package fr.spacefox.perftests.quarkus.data.entity952;

import fr.spacefox.perftests.quarkus.core.port.data.Entity952DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service952.model.Model952;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity952Repository implements Entity952DatasourcePort, PanacheRepository<Entity952> {
    @Override
    public Optional<Model952> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
