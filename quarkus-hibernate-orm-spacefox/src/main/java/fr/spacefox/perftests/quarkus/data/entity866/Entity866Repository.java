package fr.spacefox.perftests.quarkus.data.entity866;

import fr.spacefox.perftests.quarkus.core.port.data.Entity866DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service866.model.Model866;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity866Repository implements Entity866DatasourcePort, PanacheRepository<Entity866> {
    @Override
    public Optional<Model866> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
