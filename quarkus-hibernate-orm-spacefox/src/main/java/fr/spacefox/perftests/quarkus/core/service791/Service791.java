package fr.spacefox.perftests.quarkus.core.service791;

import fr.spacefox.perftests.quarkus.core.port.data.Entity791DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service791.model.Model791;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service791 {

    private final Entity791DatasourcePort datasource;

    public Service791(Entity791DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model791 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
