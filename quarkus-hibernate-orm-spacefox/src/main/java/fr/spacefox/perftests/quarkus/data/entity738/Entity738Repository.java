package fr.spacefox.perftests.quarkus.data.entity738;

import fr.spacefox.perftests.quarkus.core.port.data.Entity738DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service738.model.Model738;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity738Repository implements Entity738DatasourcePort, PanacheRepository<Entity738> {
    @Override
    public Optional<Model738> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
