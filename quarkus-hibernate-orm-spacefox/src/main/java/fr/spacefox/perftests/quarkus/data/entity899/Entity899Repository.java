package fr.spacefox.perftests.quarkus.data.entity899;

import fr.spacefox.perftests.quarkus.core.port.data.Entity899DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service899.model.Model899;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity899Repository implements Entity899DatasourcePort, PanacheRepository<Entity899> {
    @Override
    public Optional<Model899> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
