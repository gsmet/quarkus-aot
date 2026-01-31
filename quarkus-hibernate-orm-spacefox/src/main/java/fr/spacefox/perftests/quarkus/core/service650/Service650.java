package fr.spacefox.perftests.quarkus.core.service650;

import fr.spacefox.perftests.quarkus.core.port.data.Entity650DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service650.model.Model650;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service650 {

    private final Entity650DatasourcePort datasource;

    public Service650(Entity650DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model650 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
