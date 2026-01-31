package fr.spacefox.perftests.quarkus.data.entity622;

import fr.spacefox.perftests.quarkus.core.port.data.Entity622DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service622.model.Model622;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity622Repository implements Entity622DatasourcePort, PanacheRepository<Entity622> {
    @Override
    public Optional<Model622> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
