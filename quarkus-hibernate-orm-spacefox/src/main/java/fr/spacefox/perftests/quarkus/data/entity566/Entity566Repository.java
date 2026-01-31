package fr.spacefox.perftests.quarkus.data.entity566;

import fr.spacefox.perftests.quarkus.core.port.data.Entity566DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service566.model.Model566;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity566Repository implements Entity566DatasourcePort, PanacheRepository<Entity566> {
    @Override
    public Optional<Model566> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
