package fr.spacefox.perftests.quarkus.data.entity322;

import fr.spacefox.perftests.quarkus.core.port.data.Entity322DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service322.model.Model322;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity322Repository implements Entity322DatasourcePort, PanacheRepository<Entity322> {
    @Override
    public Optional<Model322> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
