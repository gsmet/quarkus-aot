package fr.spacefox.perftests.quarkus.data.entity645;

import fr.spacefox.perftests.quarkus.core.port.data.Entity645DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service645.model.Model645;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity645Repository implements Entity645DatasourcePort, PanacheRepository<Entity645> {
    @Override
    public Optional<Model645> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
