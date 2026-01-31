package fr.spacefox.perftests.quarkus.data.entity124;

import fr.spacefox.perftests.quarkus.core.port.data.Entity124DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service124.model.Model124;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity124Repository implements Entity124DatasourcePort, PanacheRepository<Entity124> {
    @Override
    public Optional<Model124> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
