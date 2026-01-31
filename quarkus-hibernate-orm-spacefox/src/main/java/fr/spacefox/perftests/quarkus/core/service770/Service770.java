package fr.spacefox.perftests.quarkus.core.service770;

import fr.spacefox.perftests.quarkus.core.port.data.Entity770DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service770.model.Model770;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service770 {

    private final Entity770DatasourcePort datasource;

    public Service770(Entity770DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model770 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
