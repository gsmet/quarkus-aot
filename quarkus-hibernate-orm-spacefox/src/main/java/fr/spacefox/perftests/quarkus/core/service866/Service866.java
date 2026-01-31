package fr.spacefox.perftests.quarkus.core.service866;

import fr.spacefox.perftests.quarkus.core.port.data.Entity866DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service866.model.Model866;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service866 {

    private final Entity866DatasourcePort datasource;

    public Service866(Entity866DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model866 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
