package fr.spacefox.perftests.quarkus.data.entity624;

import fr.spacefox.perftests.quarkus.core.port.data.Entity624DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service624.model.Model624;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity624Repository implements Entity624DatasourcePort, PanacheRepository<Entity624> {
    @Override
    public Optional<Model624> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
