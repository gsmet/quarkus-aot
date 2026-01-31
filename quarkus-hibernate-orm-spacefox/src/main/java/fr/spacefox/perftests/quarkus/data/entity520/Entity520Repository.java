package fr.spacefox.perftests.quarkus.data.entity520;

import fr.spacefox.perftests.quarkus.core.port.data.Entity520DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service520.model.Model520;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity520Repository implements Entity520DatasourcePort, PanacheRepository<Entity520> {
    @Override
    public Optional<Model520> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
