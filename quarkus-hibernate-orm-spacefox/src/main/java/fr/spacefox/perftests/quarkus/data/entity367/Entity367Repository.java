package fr.spacefox.perftests.quarkus.data.entity367;

import fr.spacefox.perftests.quarkus.core.port.data.Entity367DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service367.model.Model367;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity367Repository implements Entity367DatasourcePort, PanacheRepository<Entity367> {
    @Override
    public Optional<Model367> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
