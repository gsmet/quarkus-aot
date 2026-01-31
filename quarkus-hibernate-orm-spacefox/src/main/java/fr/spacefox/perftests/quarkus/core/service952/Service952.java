package fr.spacefox.perftests.quarkus.core.service952;

import fr.spacefox.perftests.quarkus.core.port.data.Entity952DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service952.model.Model952;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service952 {

    private final Entity952DatasourcePort datasource;

    public Service952(Entity952DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model952 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
