package fr.spacefox.perftests.quarkus.data.entity980;

import fr.spacefox.perftests.quarkus.core.port.data.Entity980DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service980.model.Model980;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity980Repository implements Entity980DatasourcePort, PanacheRepository<Entity980> {
    @Override
    public Optional<Model980> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
